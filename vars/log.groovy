//def info(message) {
//    echo "INFO: ${message}"
//}
//
//def warning(message) {
//    echo "WARNING: ${message}"
//}

def call() {
    pipeline {
        agent any
        stages {
          stage ( 'one'){
              steps {
                  sh 'echo One'

              }
          }
          stage {
              stage ( 'Two'){
                  steps{
                      sh 'echo Two'
                  }
              }
          }
        }

    }
}