pipeline {
    agent any
    options {
      // Only keep the 10 most recent builds
      buildDiscarder(logRotator(numToKeepStr:'10'))
    }

    tools{
        maven 'M3'
    }
  
    stages {
        stage('Build') {
            steps {
                echo 'Run Maven on a Unix agent'
                sh "mvn clean package -DskipTests=True"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mvn install'
            }
        }
    }
    
    post{
        success{
            echo "SUCCESSFUL: Job ${env.JOB_NAME} [${env.BUILD_NUMBER}] "
        }
    }
}
