def call(){
    node() {
        common.cleanup()
        if ( env.BRANCH_NAME == env.TAG_NAME )
        {
            common.publishArtifacts()

        }
    }

}
