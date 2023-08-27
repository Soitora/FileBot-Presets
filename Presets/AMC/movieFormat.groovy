{ anime ? "Anime Films" : "Movies" }
{"/"}
{collection.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets() + "/"}
{
	def table = csv("O:/FileBot/filebot.override.title.csv")
	table[n] ?: n.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets()
}
{" ($y)"}
{" {tmdb-$id}/"}
{
    "[" +
    any{group; group}{fn.match(/^\[(.*?)\]/)} +
    "] "
}
{
	def table = csv("O:/FileBot/filebot.override.title.csv")
	table[n] ?: n.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets()
}
{" ($y)"}
{
    " [" +
    any{
        allOf{vf}{vc}{any{vs.replace("WEB-DL","WebRip")}{"WebRip"}}{audioLanguages.size() > 1 ? "Dual Audio" : null}{group =~ /(?i)SubsPlease|CameEsp|Sandalphon|ASW|SSA|FFA/ ? "RSS" : null}.joining(", ")
    }{ "ERROR" } +
    "]"
}
{subt}