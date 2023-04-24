def cleanup(){

    stage('Cleanuop Old Data') {

        sh ' rm -rf *'
        git branch: 'main', url: "https://github.com/Zeeshanhyder01/${COMPONENT}.git"
    }
}