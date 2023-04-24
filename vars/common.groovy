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
       zip -r ${COMPONENT}.zip node_modules server.js   
    """

        }
    }


}