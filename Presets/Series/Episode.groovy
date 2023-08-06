@O:\FileBot\Presets\Series\SeriesName.groovy
{" - "}
{sxe.pad(2)}
{
	t ==~ /(Volume|Episode).[0-9]+/ ? null : " - " + t.replaceAll(":","꞉").validateFileName().truncate(50, /\s/)
}
{ if (t.length() > 50) "..." }