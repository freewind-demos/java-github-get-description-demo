package demo;


import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;

public class Hello {

    public static void main(String[] args) throws IOException {
        RepositoryService service = new RepositoryService();
        Repository repo = service.getRepository("freewind-demos", "java-github-get-description-demo");
        System.out.println(repo.getDescription());
    }

}

