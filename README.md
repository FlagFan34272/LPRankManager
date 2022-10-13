# LPRankManager
## info
- Java를 사용하였습니다

## Commands
- /rankset
- /rankchange
- /rankunset

```java
Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent unset default");
Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent set " + args[1]);
Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp reloadconfig");
```

네. 맞아요. 럭펌 만지기 귀찮아서 만든거..
