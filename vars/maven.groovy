def call(){
    node() {

        common.cleanup()

        stage ('Build Package') {
            sh '''
           mvn clean package 
        '''
        }

    }

}

