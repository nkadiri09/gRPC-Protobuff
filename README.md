# Start with gRPC 

  <details>
  <summary>Required dependencies and plugins.</summary>

      <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>${grpc.java.version}</version>
        </dependency>
        <dependency> <!-- necessary for Java 9+ -->
            <groupId>org.apache.tomcat</groupId>
            <artifactId>annotations-api</artifactId>
            <version>${tomcat.annotations.version}</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>${jackson.databind.version}</version>
        </dependency
        <build>
        <extensions>
            <extension>
                <groupId>kr.motd.maven</groupId>
                <artifactId>os-maven-plugin</artifactId>
                <version>${os.maven.plugin.version}</version>
            </extension>
        </extensions>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.xolstice.maven.plugins</groupId>
                <artifactId>protobuf-maven-plugin</artifactId>
                <version>0.6.1</version>
                <configuration>
                    <protocArtifact>
                        com.google.protobuf:protoc:3.24.0:exe:${os.detected.classifier}
                    </protocArtifact>
                    <pluginId>grpc-java</pluginId>
                    <pluginArtifact>
                        io.grpc:protoc-gen-grpc-java:${grpc.java.version}:exe:${os.detected.classifier}
                    </pluginArtifact>
                    <protoSourceRoot>
                        ${basedir}/src/main/proto/
                    </protoSourceRoot>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>compile-custom</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>

  </details>

<details>
<summary>Java Options</summary>
  
    syntax = "proto3"; #identifying version of proto
    option java_multiple_files = true;  #defining model outside of outer class
    option java_package ="com.naren.models"; #defining package for generated java classes

</details>