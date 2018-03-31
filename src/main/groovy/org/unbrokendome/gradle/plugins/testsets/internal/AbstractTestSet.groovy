package org.unbrokendome.gradle.plugins.testsets.internal

import org.unbrokendome.gradle.plugins.testsets.dsl.TestSet


abstract class AbstractTestSet implements TestSet {

    @Override
    String getTestTaskName() {
        name
    }


    @Override
    String getJarTaskName() {
        "${name}Jar"
    }


    @Override
    String getSourceSetName() {
        name
    }


    @Override
    String getCompileConfigurationName() {
        "${name}Compile"
    }


    @Override
    String getCompileOnlyConfigurationName() {
        "${name}CompileOnly"
    }


    String getImplementationConfigurationName() {
        "${name}Implementation"
    }


    @Override
    String getRuntimeConfigurationName() {
        "${name}Runtime"
    }


    @Override
    String getRuntimeOnlyConfigurationName() {
        "${name}RuntimeOnly"
    }


    @Override
    String getArtifactConfigurationName() {
        name
    }


    @Override
    String getClassifier() {
        name
    }
}
