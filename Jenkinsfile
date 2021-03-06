pipeline {

   agent any

   stages {

        stage("Build") {
            steps{
               sh 'chmod +x gradlew'
               sh './gradlew compileJava'
            }
        }

        stage("Test") {
            steps{
                sh './gradlew test'
            }
        }

        stage("Test Coverage") {
            steps{
                sh './gradlew jacocoTestCoverageVerification'
           }
        }

        stage("Code analysis") {
            steps{
                sh './gradlew checkstyleMain'
            }
       }

        stage("Package") {
            steps{
                sh "./gradlew build"
            }
        }

        stage("Docker build") {
            steps{
                sh "docker build -t localhost:5000/calculator ."
            }
        }

        stage("Docker push") {
            steps{
                sh "docker push localhost:5000/calculator"
            }
        }

        stage("Deploy to staging") {
            steps{
                sh "docker run -d --rm -p 8765:8080 --name calculator localhost:5000/calculator"
            }
        }

        stage("Acceptance test") {
            steps{
                sleep 60
                sh "chmod +x acceptance_test.sh && ./acceptance_test.sh"
            }
        }
   }
}
