# FileBot Presets

Most of the files in the main directory is to be used with "FileBot AMC", a post-torrent feature to automatically process entries.

Presets are in the `\Presets\`

## FileBot GUI Configuration

### Presets

#### Series
**Files**: `Use Original Files selection`

**Format**:
- **Expression** 
  - `@O:\FileBot\Presets\RootPath.groovy`
  - `@O:\FileBot\Presets\Series\Path.groovy`
  - `@O:\FileBot\Presets\Series\File.groovy`

**Options**:
- **Datasource**: TheMovieDB::TV
- **Language**: English
- **Rename Action**: Rename
- **Episode Order**: Airdate
- **Match Mode**: Opportunistic
- **Keyboard Shortcut**: 1

## AMC Configuration

### `filebot.conf`
Setting the correct path requires you to replace the `O:` in the configuration.
If you got your stuff on `C:`, and not on `O:` like I do, change the letters.
- Example: `C:\Media\` instead of `O:\Media\`

#### Paths
`O:\FileBot\` is the path to where you put this repository, by default it'll probably be named `FileBot-Presets`, and not be placed in your root directory.

`O:\Media\` is the root directory to your anime/series/movies.

The whole repository is designed for use with an output like:
`O:\Media\Anime\`
`O:\Media\Anime Films\`
`O:\Media\Series\`
`O:\Media\Movies\`

Changing `O:\Media\` to `C:\Users\USER\Videos\` in the configuration will make the files output to:
`C:\Users\USER\Videos\Anime\`
`C:\Users\USER\Videos\Anime Films\`
`C:\Users\USER\Videos\Series\`
`C:\Users\USER\Videos\Movies\`

#### Plex
If you use **Plex**, create a `filebot.plex.conf` file in the root directory, and add `PLEX_IP:TOKEN` in it, or replace the line directly in `filebot.conf`.
- Example: `127.0.0.1:AbCdEfGhIjKlMnOp`

#### Discord notifications
If you want to use **Discord notifications**, create a `filebot.discord.conf` file in the root directory, and add `DISCORD_WEBHOOK` in it, or replace the line directly in `filebot.conf`.
- Example: `https://discord.com/api/webhooks/123456789/AbCdEfGhIjKlMnOp-123456789`

### `filebot.exclude`
Sometimes you get false matches, and this file will help you avoid that.
For example, when I wanted to auto rename `MEGALOBOX: Nomads`, I got false results on `Nomads`, and this made FileBot ignore those.

### `filebot.override.csv`
This override file is designed to give you the ability to override result names.
For example, the first line is `Asobi Asobase - workshop of fun -;Asobi Asobase`

Simply put, I want `Asobi Asobase - workshop of fun -` to be called just `Asobi Asobase`.

### `filebot.postprocess.info`
This file is just a helper file for how I have configured the post-download script in qBitTorrent, so I don't need to look up how it's done again if I have a fresh installation.

### `filebot.postprocess.bat`
This file uses `mkvpropedit` to set the title to the correct one after the script has run.