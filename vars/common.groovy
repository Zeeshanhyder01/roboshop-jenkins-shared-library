def cleanup(){

    stage('Cleanuop Old Data') {

        sh ' rm -rf *'
        git branch: 'main', url: "https://github.com/Zeeshanhyder01/${COMPONENT}.git"
    }
}


def publishArtifacts(){
    stage("prepare Artifacts"){
        if(env.APP_TYPE == "nodejs" ){
            sh """
       zip -r ${COMPONENT}-${TAG_NAME}.zip node_modules server.js   
    """

        }
    }
stage(' Push Artifacts to Nexus'){
    withCredentials([usernamePassword(credentialsId: 'nexus', passwordVariable: 'pass', usernameVariable: 'user')]) {
        sh """
           curl -v -u ${user}:${pass}  --upload-file ${COMPONENT}-${TAG_NAME}.zip  http://172.31.5.112:8081/repository/${COMPONENT}/${COMPONENT}-${TAG_NAME}.zip
        """
    }

  }
}

