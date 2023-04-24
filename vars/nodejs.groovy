def call(){
    node() {

        common.cleanup()

        stage ('Download Dependencies') {
            sh '''
           ls -ltr
           npm install   
        '''
        }
        //If BOTH ARE EQUAL THEN IT IS DEFINITELY TAG
        if ( env.BRANCH_NAME == env.TAG_NAME )
        {
            common.publishArtifacts()

        }
    }

}

