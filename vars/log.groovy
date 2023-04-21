def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

//def call(){
//    pipeline {
//        agent any
//        stages {
//            stage( 'one'){
//                steps {
//                    sh 'echo One ${COMPONENT}'
//
//                }
//            }
//        }
//    }
//}

//def call() {
//    node() {
//        stage('one') {
//            sh 'echo One - ${COMPONENT}'
//        }
//
//        //
//        // THIS IS SAMPLE
//
//        stage ('Two ') {
//            sh 'echo Two - ${COMPONENT}'
//        }
//    }
//}