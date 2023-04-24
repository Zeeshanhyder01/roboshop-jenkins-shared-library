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
//stage(' Push Artifacts to Nexus'){
//  sh """
//     curl -v -u admin:786110 --upload-file pom.xml http://localhost:8081/repository/maven-releases/org/foo/1.0/foo-1.0.pom
//  """
//  }
}

