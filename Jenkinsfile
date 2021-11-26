pipeline {
   agent any
   stages{

       stage("Build"){
           steps{
               sh 'chmod +x gradlew'
               sh './gradlew compileJava'
           }
       }

       stage("Test"){
           steps{
               sh './gradlew test'
           }
       }

       stage("Test Coverage"){
           steps{
                sh './gradlew jacocoTestReport'
                sh './gradlew jacocoTestCoverageVerification'
           }
       }

       stage("Code analysis"){
            steps{
                sh './gradlew checkstyleMain'
            }
       }
   }
}
