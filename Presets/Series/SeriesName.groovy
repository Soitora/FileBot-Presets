{
	def table = csv("O:/FileBot/filebot.override.csv")
	table[n] ?: n.replaceAll(/[!?.`"]+/).replaceAll(":","꞉").replaceTrailingBrackets()
}