pipeline {
   agent any
   stages {
      stage('sanity checks') {
      steps {
        cleanWs() // clean jenkins so it re-clones
        checkout scm // re-clone/re-download
        sh 'git branch'
        sh "git checkout ${ghprbSourceBranch}"
        sh 'git branch'
        sh 'git status'
      }
  }
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
