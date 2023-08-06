{
    " [" +
    any{
        allOf{vf}{vc}{any{vs.replace("DVD-R","DiscRip").replace("WEB-DL","WebRip")}{"WebRip"}}{audioLanguages.size() > 1 ? "Dual Audio" : null}{group =~ /(?i)SubsPlease|CameEsp|Sandalphon|ASW|SSA|FFA/ ? "RSS" : null}.joining(", ")
    }{ "ERROR" } +
    "]"
}
{episodes.absolute.bounds().joining("-", " [", "]")}
{subt}
{fn.match(/-mediainfo/)}