#!/usr/bin/env groovy

pipeline {
  agent any
  options {
    timestamps()
  }

  stages {

    stage('Checkout') {
      steps{
        checkout scm
      }
    }

    stage('Build hello-ui') {
      when {
        changeset "hello-ui/**"
      }
      steps {
        echo 'building hello-ui'
      }
    }

    stage('Build hello-service') {
      when {
        changeset "hello-service/**"
      }
      steps {
        echo 'building hello-service'
      }
    }

    stage('Build root reactor') {
      when {
        changeset "**/Jenkinsfile"
      }
      steps {
        echo 'building root reactor'
      }
    }

  }
}
