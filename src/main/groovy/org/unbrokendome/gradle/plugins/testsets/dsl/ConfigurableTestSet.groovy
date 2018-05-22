package org.unbrokendome.gradle.plugins.testsets.dsl

/**
 * A {@link TestSet} whose properties can be modified.
 */
interface ConfigurableTestSet extends TestSet {

    ConfigurableTestSet extendsFrom(TestSet... superTestSets)


    void setCreateArtifact(boolean createArtifact)


    void setClassifier(String classifier)


    void setDirName(String dirName)


    void setEnvironmentVariables(Map<String, Object> environmentVariables)


    void setSystemProperties(Map<String, Object> systemeProperties)
}
