pipeline {
    agent any
    options {
      // Only keep the 10 most recent builds
      buildDiscarder(logRotator(numToKeepStr:'10'))
    }
  
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -B -DskipTests clean package'
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
}
