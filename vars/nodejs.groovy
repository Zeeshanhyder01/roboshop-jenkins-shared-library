def call(){
    node() {

        common.cleanup()

        stage ('Download Dependencies') {
            sh '''
           ls -ltr
           npm install   
        '''
        }

    }

}

