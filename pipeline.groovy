pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        // Build your application code here
        sh 'npm install'
        sh 'npm run build'
      }
    }

    stage('Test') {
      steps {
        // Run tests
        sh 'npm test'
      }
    }

    stage('Deploy') {
      steps {
        // Deploy your application to the target environment
        sh 'npm run deploy'
      }
    }
  }
}
