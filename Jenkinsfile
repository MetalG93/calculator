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
                publishHTML(target: [
                    reportDir: '/build/reports/jacoco/test/html',
                    reportFiles: 'index.html'
                    reportName: 'JaCoCo Report'
                ])
                sh './gradlew jacocoTestCoverageVerification'
           }
       }
   }
}
