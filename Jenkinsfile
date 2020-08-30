pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/arjun-prasad/spring-boot'
                // Run Maven on a Windows agent.
                bat "mvn clean package"
                bat "docker build -t arj-spring/sample-spring-boot ."
                bat "docker run -p 8082:8082 arj-spring/sample-spring-boot"
                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

           // post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
            //   success {
             //       junit '**/target/surefire-reports/TEST-*.xml'
              //      archiveArtifacts 'target/*.jar'
                //}
           // }
        }
    }
}
