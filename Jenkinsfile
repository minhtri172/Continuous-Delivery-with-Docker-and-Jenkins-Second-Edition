pipeline {
    agent {
        label 'docker-agent'
    }
    
    stages {
        stage('Checkout code and prepare environment') {
            steps {
                git url: 'https://github.com/minhtri172/Continuous-Delivery-with-Docker-and-Jenkins-Second-Edition.git', branch: 'master'
                sh """
                cd Chapter08/sample1
                chmod +x gradlew 
                """
            }
        }
        stage('Compile code') {
            steps {
                sh """
                cd Chapter08/sample1
                ./gradlew compileJava
                """
            }
        }
        stage('Run test, code coverage and generate reports') {
            steps {
                sh """
                cd Chapter08/sample1
                ./gradlew test
				./gradlew jacocoTestCoverageVerification
                ./gradlew jacocoTestReport 
                """
                publishHTML(
                    target: [
                        reportDir: 'Chapter08/sample1/build/reports/jacoco/test/html',
                        reportFiles: 'index.html',
                        reportName: "JaCoCo Report"
                    ]
                )
            }
        }
        stage('Run Jacoco checkstyle') {
            steps {
                sh """
                cd Chapter08/sample1
                ./gradlew checkstyleMain
                """

                publishHTML(
                    target: [
                        reportDir: 'Chapter08/sample1/build/reports/checkstyle',
                        reportFiles: 'main.html',
                        reportName: "JaCoCo Checkstyle"
                    ]
                )
            }
        }
    }
}