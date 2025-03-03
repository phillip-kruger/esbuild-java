package io.mvnpm.esbuild;

import java.io.IOException;
import java.nio.file.Path;

import io.mvnpm.esbuild.model.ExecuteResult;
import io.mvnpm.esbuild.resolve.ExecutableResolver;

public class Main {

    public static void main(String[] args) throws IOException {
        final Path esBuildExec = new ExecutableResolver().resolve(Bundler.ESBUILD_EMBEDDED_VERSION);
        final ExecuteResult executeResult = new Execute(esBuildExec.toFile(), args).executeAndWait();
        System.out.println(executeResult.output());
    }
}
