pipeline {
   agent any
   stages {
    stage('maven install') {
      steps {
        // if neede git clone here
        withMaven(globalMavenSettingsConfig: 'null', jdk: 'null', maven: 'null', mavenSettingsConfig: 'null') 
        {
           sh 'mvn clean install'
        }
      }
    }

  } 
}
