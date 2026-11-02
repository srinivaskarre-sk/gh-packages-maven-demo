# gh-packages-maven-demo

A dummy Java library (`io.github.srinivaskarre:hello-lib:1.0.0`) published to GitHub Packages, to check one question:

**Can anyone download a public Maven package from GitHub Packages without a token?**

The `Publish and consume` workflow (`.github/workflows/publish-and-consume.yml`):

1. **publish**: deploys `hello-lib` 1.0.0 with the workflow's `GITHUB_TOKEN`.
2. **consume-anonymous**: requests the package with no credentials, first with `curl` and then with Maven, the way a customer without a GitHub token would.
3. **consume-with-token**: downloads it with a token.

Results appear in each run's summary.

## Try it yourself without a token

```bash
curl -i https://maven.pkg.github.com/srinivaskarre-sk/gh-packages-maven-demo/io/github/srinivaskarre/hello-lib/maven-metadata.xml
```
