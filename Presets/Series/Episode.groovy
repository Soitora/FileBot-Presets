@O:\FileBot\Presets\Series\SeriesName.groovy
{" - "}
{sxe.pad(2)}
{
    // Check if the title matches certain patterns
    t ==~ /(Volume|Episode).[0-9]+/ ? null :
    // Replace colons with a special character, validate the filename, truncate properly, and ensure it ends appropriately
    " - " + t.replaceAll(":", "꞉").validateFileName().take(50).replaceAll(/(\s\w+)?$/, "").replaceAll(/\W*$/, "").replaceAll(/꞉$/, "")
}
{
    // Add ellipsis if the title was truncated
    if (t.length() > 50) "..."
}