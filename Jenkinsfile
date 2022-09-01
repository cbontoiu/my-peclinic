pipeline {
   agent any
   stages {
    stage('maven install') {
      steps {
        // if needed git clone here
        withMaven(maven: 'maven3') 
        {
           sh 'mvn clean install'
        } // end withMaven
      } // end steps
    } // end stage
  } // end stages
} // end pipeline
