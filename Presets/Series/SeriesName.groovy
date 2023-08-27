{
	def table = csv("O:/FileBot/filebot.override.title.csv")
	table[n] ?: n.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets()
}