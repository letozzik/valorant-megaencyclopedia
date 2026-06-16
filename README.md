# valorant megaencyclopedia

a program version of the already existing [Valorant wiki](https://valorant.fandom.com/wiki/VALORANT_Wiki) and [Kingdom Archives](https://kingdomarchives.com/) which can be accessed at any point and without the need for an internet connection.

this is currently a work in progerss and a proof of concept, owned, developed and maintained by me, for issues regarding the application, main code, or if you want to contribute in any way, feel free to send me an email at letozzik@gmail.com, but remember, i am 1 guy, any delays in development, uploads or replies are expected. 

note: i am actively working on getting the green light from Riot Games themselves and the Kingdom Archives devteam, the statuses are below:
Riot: APPLICATION IN PROCESS, WEBSITE NEEDED (see below)
K.A: APPROVAL REQUEST NOT SUBMITTED

softwares at use currently are:

for the mobile app:
Android Studio (Java to Kotlin or just Java, depends on the IDE version)
[Kingdom Archives](https://kingdomarchives.com/) and [Valorant wiki](https://valorant.fandom.com/wiki/VALORANT_Wiki) for the media needed.

desktop app
Visual Studio code
[Kingdom Archives](https://kingdomarchives.com/) and [Valorant wiki](https://valorant.fandom.com/wiki/VALORANT_Wiki) for the media needed.

what currently has been finished is:

# Figma design

<img width="1381" height="962" alt="Screenshot 2026-06-16 100221" src="https://github.com/user-attachments/assets/42224ec6-c714-49c6-a673-b2f3d6d3d504" />

# Project structure
mobile app:
androidstudio/
│
mainActivity.java # the main menu with a list of buttons agents.java #the list of available agents, which get manually updated every time a new agent is added (tedious, but it's the cost of making it offline)
[AGENTNAME].java  # model viewer class, with arrows letting the user cycle between images of the agent model for the given agent
killbanners.java # for the list of skins who's killbanners to show
[SKINNAME]Killbanner.java # for showing a given skin's killbanner from 1 kill to ace or 6 kills, whichever is the maximum
README.md
+ more (shown in Figma prototype above)
  
# Website prototype for personal use and to describe the project as is required by Riot Games
currently unavailable, keep an eye out on the color change of this url: letozzik.net
if white: domain unavailable
if blue: domain registered and the site's up and running

# means for donations so i can keep myself afloat

[buy me a Monster](https://ko-fi.com/K7R721I5LL)
[support me on Patreon](https://patreon.com/letozzik?utm_medium=unknown&utm_source=join_link&utm_campaign=creatorshare_creator&utm_content=copyLink)
note: all donations are willingly made, the final product will be available puiblicly to all, any paywalled content related to the project that is made, if not scrapped, will be added to the final product.

# the VALORANT Megaecnyclopedia was created under Riot Games' ["Legal Jibber Jabber"](https://www.riotgames.com/en/legal) policy using assets owned by Riot Games. Riot Games does not endorse or sponsor this project.
