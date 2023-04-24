def call(){
    node() {

        if ( env.BRANCH_NAME == env.TAG_NAME )
        {
            common.publishArtifacts()

        }
    }

}
