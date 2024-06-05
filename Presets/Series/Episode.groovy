@O:\FileBot\Presets\Series\SeriesName.groovy
{" - "}
{sxe.pad(2)}
{
    // Check if the title matches certain patterns
    if (t =~ /(Volume|Episode).[0-9]+/) {
        null
    } else {
        // Replace colons with a special character, validate the filename, truncate properly, and ensure it ends appropriately
        def truncated = t.replaceAll(":", "꞉").validateFileName().take(50).replaceAll(/(\s\w+)?$/, "").replaceAll(/\W*$/, "").replaceAll(/꞉$/, "")
        def isTruncated = truncated.length() < t.length() || truncated.length() == 50
        " - " + truncated + (isTruncated ? "..." : "")
    }
}
