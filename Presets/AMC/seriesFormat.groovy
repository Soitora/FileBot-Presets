{ anime ? "Anime" : "Series" }
{"/"}
{
	def table = csv("O:/FileBot/filebot.override.title.csv")
	table[n] ?: n.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets()
}
{" ($y) {tmdb-$id}/"}
{episode.special ? "Specials" + "/" : "Season " + s00 + "/"}
{
    "[" +
    any{group; group}{fn.match(/^\[(.*?)\]/)} +
    "] "
}
{
	def table = csv("O:/FileBot/filebot.override.title.csv")
	table[n] ?: n.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets()
}
{" - "}
{sxe.pad(2)}
{
	t ==~ /(Volume|Episode).[0-9]+/ ? null : " - " + t.replaceAll(":","꞉").validateFileName().truncate(50, /\s/)
}
{ if (t.length() > 50) "..." }
{
    " [" +
    any{
        allOf{vf}{vc}{any{vs.replace("WEB-DL","WebRip")}{"WebRip"}}{audioLanguages.size() > 1 ? "Dual Audio" : null}{group =~ /(?i)SubsPlease|CameEsp|Sandalphon|ASW|SSA|FFA/ ? "RSS" : null}.joining(", ")
    }{ "ERROR" } +
    "]"
}
{episodes.absolute.bounds().joining("-", " [", "]")}
{subt}