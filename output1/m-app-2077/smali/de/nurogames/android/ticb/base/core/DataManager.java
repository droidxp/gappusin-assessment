public class de.nurogames.android.ticb.base.core.DataManager {
	 /* .source "DataManager.java" */
	 /* # static fields */
	 private static final java.lang.String KEY_SCORES;
	 private static final java.lang.String KEY_SETTINGS;
	 public static final Integer SOCIAL_FACEBOOK;
	 public static final Integer SOCIAL_TWITTER;
	 public static java.lang.String sFBPermissions;
	 /* # instance fields */
	 private highscores_endless;
	 private highscores_story;
	 private Boolean isRecord;
	 private overall;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.core.DataManager ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 31 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "publish_stream"; // const-string v2, "publish_stream"
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "photo_upload"; // const-string v2, "photo_upload"
		 /* aput-object v2, v0, v1 */
		 /* .line 34 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.core.DataManager ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/16 v1, 0xa */
		 /* .line 6 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 11 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/DataManager;->isRecord:Z */
		 /* .line 16 */
		 /* new-array v0, v1, [I */
		 this.highscores_story = v0;
		 /* .line 19 */
		 /* new-array v0, v1, [I */
		 this.highscores_endless = v0;
		 /* .line 24 */
		 int v0 = 7; // const/4 v0, 0x7
		 /* new-array v0, v0, [I */
		 this.overall = v0;
		 /* .line 6 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer BestScore ( Integer p0 ) {
		 /* .locals 3 */
		 /* .param p1, "game_type" # I */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 234 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 235 */
		 /* .local v0, "value":I */
		 /* if-nez p1, :cond_1 */
		 /* .line 236 */
		 v1 = this.highscores_story;
		 /* aget v0, v1, v2 */
		 /* .line 240 */
	 } // :cond_0
} // :goto_0
/* .line 237 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_0 */
/* .line 238 */
v1 = this.highscores_endless;
/* aget v0, v1, v2 */
} // .end method
public void Scores ( Integer[] p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "values" # [I */
/* .param p2, "game_type" # I */
/* .prologue */
/* .line 246 */
/* if-nez p2, :cond_2 */
/* .line 247 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_0
/* array-length v1, p1 */
/* if-lt v0, v1, :cond_1 */
/* .line 253 */
} // .end local v0 # "x":I
} // :cond_0
return;
/* .line 248 */
/* .restart local v0 # "x":I */
} // :cond_1
v1 = this.highscores_story;
/* aget v2, p1, v0 */
/* aput v2, v1, v0 */
/* .line 247 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 249 */
} // .end local v0 # "x":I
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
/* if-ne p2, v1, :cond_0 */
/* .line 250 */
int v0 = 0; // const/4 v0, 0x0
/* .restart local v0 # "x":I */
} // :goto_1
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_0 */
/* .line 251 */
v1 = this.highscores_endless;
/* aget v2, p1, v0 */
/* aput v2, v1, v0 */
/* .line 250 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public Scores ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "game_type" # I */
/* .prologue */
/* .line 256 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v0, v1, [I */
/* .line 257 */
/* .local v0, "value":[I */
/* if-nez p1, :cond_1 */
/* .line 258 */
v0 = this.highscores_story;
/* .line 262 */
} // :cond_0
} // :goto_0
/* .line 259 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_0 */
/* .line 260 */
v0 = this.highscores_endless;
} // .end method
public void clearHighscore ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "game_type" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 120 */
v3 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v4 = "Nuromedia_TinyBee_Scores"; // const-string v4, "Nuromedia_TinyBee_Scores"
(( android.content.Context ) v3 ).getSharedPreferences ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 121 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 123 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "x":I */
} // :goto_0
v3 = this.highscores_endless;
/* array-length v3, v3 */
/* if-lt v2, v3, :cond_0 */
/* .line 129 */
/* .line 130 */
return;
/* .line 124 */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "HS"; // const-string v4, "HS"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 125 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "HSE"; // const-string v4, "HSE"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 123 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public Boolean hasUserRated ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 324 */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v2 = "Nuromedia_TinyBee_Settings"; // const-string v2, "Nuromedia_TinyBee_Settings"
(( android.content.Context ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 326 */
/* .local v0, "settings":Landroid/content/SharedPreferences; */
v1 = final String v1 = "RATED"; // const-string v1, "RATED"
} // .end method
public void isRekord ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "value" # Z */
/* .prologue */
/* .line 230 */
/* iput-boolean p1, p0, Lde/nurogames/android/ticb/base/core/DataManager;->isRecord:Z */
/* .line 231 */
return;
} // .end method
public Boolean isRekord ( ) {
/* .locals 1 */
/* .prologue */
/* .line 226 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/core/DataManager;->isRecord:Z */
} // .end method
public void loadOverall ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 267 */
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v3 = "Nuromedia_TinyBee_Scores"; // const-string v3, "Nuromedia_TinyBee_Scores"
(( android.content.Context ) v2 ).getSharedPreferences ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 269 */
/* .local v0, "settings":Landroid/content/SharedPreferences; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
v2 = this.overall;
/* array-length v2, v2 */
/* if-lt v1, v2, :cond_0 */
/* .line 272 */
v2 = this.overall;
/* aget v2, v2, v5 */
/* .line 273 */
v2 = this.overall;
int v3 = 1; // const/4 v3, 0x1
/* aget v2, v2, v3 */
/* .line 274 */
v2 = this.overall;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
/* .line 275 */
v2 = this.overall;
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
/* .line 276 */
v2 = this.overall;
int v3 = 4; // const/4 v3, 0x4
/* aget v2, v2, v3 */
/* .line 277 */
v2 = this.overall;
int v3 = 5; // const/4 v3, 0x5
/* aget v2, v2, v3 */
/* .line 279 */
v2 = this.overall;
int v3 = 6; // const/4 v3, 0x6
/* aget v2, v2, v3 */
/* .line 281 */
return;
/* .line 270 */
} // :cond_0
v2 = this.overall;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "STATS"; // const-string v4, "STATS"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v3 = (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput v3, v2, v1 */
/* .line 269 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public void loadSettings ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 45 */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v2 = "Nuromedia_TinyBee_Settings"; // const-string v2, "Nuromedia_TinyBee_Settings"
(( android.content.Context ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 46 */
/* .local v0, "settings":Landroid/content/SharedPreferences; */
v1 = final String v1 = "useMusic"; // const-string v1, "useMusic"
de.nurogames.android.ticb.base.core.AppResources.useMusic = (v1!= 0);
/* .line 47 */
v1 = final String v1 = "useSounds"; // const-string v1, "useSounds"
de.nurogames.android.ticb.base.core.AppResources.useSounds = (v1!= 0);
/* .line 48 */
v1 = final String v1 = "useVibra"; // const-string v1, "useVibra"
de.nurogames.android.ticb.base.core.AppResources.useVibra = (v1!= 0);
/* .line 49 */
v1 = final String v1 = "characterID"; // const-string v1, "characterID"
/* .line 50 */
v1 = final String v1 = "has_payed_unlimited_play"; // const-string v1, "has_payed_unlimited_play"
de.nurogames.android.ticb.base.core.AppResources.hasPayedUnlimitedPlay = (v1!= 0);
/* .line 52 */
return;
} // .end method
public void restoreHighscores ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "game_type" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 87 */
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v3 = "Nuromedia_TinyBee_Scores"; // const-string v3, "Nuromedia_TinyBee_Scores"
(( android.content.Context ) v2 ).getSharedPreferences ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 89 */
/* .local v0, "settings":Landroid/content/SharedPreferences; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
v2 = this.highscores_endless;
/* array-length v2, v2 */
/* if-lt v1, v2, :cond_0 */
/* .line 96 */
return;
/* .line 90 */
} // :cond_0
v2 = this.highscores_story;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "HS"; // const-string v4, "HS"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v3 = (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput v3, v2, v1 */
/* .line 92 */
v2 = this.highscores_endless;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "HSE"; // const-string v4, "HSE"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v3 = (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput v3, v2, v1 */
/* .line 89 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public void saveHighscores ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "game_type" # I */
/* .prologue */
/* .line 102 */
v3 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v4 = "Nuromedia_TinyBee_Scores"; // const-string v4, "Nuromedia_TinyBee_Scores"
int v5 = 0; // const/4 v5, 0x0
(( android.content.Context ) v3 ).getSharedPreferences ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 103 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 106 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "x":I */
} // :goto_0
v3 = this.highscores_endless;
/* array-length v3, v3 */
/* if-lt v2, v3, :cond_0 */
/* .line 112 */
/* .line 113 */
return;
/* .line 107 */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "HS"; // const-string v4, "HS"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v4 = this.highscores_story;
/* aget v4, v4, v2 */
/* .line 108 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "HSE"; // const-string v4, "HSE"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v4 = this.highscores_endless;
/* aget v4, v4, v2 */
/* .line 106 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public void saveOverall ( Integer[] p0 ) {
/* .locals 6 */
/* .param p1, "values" # [I */
/* .prologue */
/* .line 287 */
v3 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v4 = "Nuromedia_TinyBee_Scores"; // const-string v4, "Nuromedia_TinyBee_Scores"
int v5 = 0; // const/4 v5, 0x0
(( android.content.Context ) v3 ).getSharedPreferences ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 288 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 291 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "x":I */
} // :goto_0
v3 = this.overall;
/* array-length v3, v3 */
/* add-int/lit8 v3, v3, -0x1 */
/* if-lt v2, v3, :cond_0 */
/* .line 295 */
final String v3 = "STATS6"; // const-string v3, "STATS6"
int v4 = 6; // const/4 v4, 0x6
/* aget v4, p1, v4 */
/* .line 298 */
/* .line 300 */
(( de.nurogames.android.ticb.base.core.DataManager ) p0 ).loadOverall ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/core/DataManager;->loadOverall()V
/* .line 301 */
return;
/* .line 292 */
} // :cond_0
v3 = this.overall;
/* aget v4, v3, v2 */
/* aget v5, p1, v2 */
/* add-int/2addr v4, v5 */
/* aput v4, v3, v2 */
/* .line 293 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "STATS"; // const-string v4, "STATS"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v4 = this.overall;
/* aget v4, v4, v2 */
/* .line 291 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public void saveSettings ( ) {
/* .locals 6 */
/* .prologue */
/* .line 59 */
v3 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v4 = "Nuromedia_TinyBee_Settings"; // const-string v4, "Nuromedia_TinyBee_Settings"
int v5 = 0; // const/4 v5, 0x0
(( android.content.Context ) v3 ).getSharedPreferences ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 60 */
/* .local v2, "settings":Landroid/content/SharedPreferences; */
/* .line 62 */
/* .local v1, "editor":Landroid/content/SharedPreferences$Editor; */
final String v3 = "useMusic"; // const-string v3, "useMusic"
/* sget-boolean v4, Lde/nurogames/android/ticb/base/core/AppResources;->useMusic:Z */
/* .line 63 */
final String v3 = "useSounds"; // const-string v3, "useSounds"
/* sget-boolean v4, Lde/nurogames/android/ticb/base/core/AppResources;->useSounds:Z */
/* .line 64 */
final String v3 = "useVibra"; // const-string v3, "useVibra"
/* sget-boolean v4, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
/* .line 65 */
final String v3 = "characterID"; // const-string v3, "characterID"
/* .line 66 */
final String v3 = "has_payed_unlimited_play"; // const-string v3, "has_payed_unlimited_play"
/* sget-boolean v4, Lde/nurogames/android/ticb/base/core/AppResources;->hasPayedUnlimitedPlay:Z */
/* .line 70 */
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 77 */
} // :goto_0
return;
/* .line 72 */
/* :catch_0 */
/* move-exception v0 */
/* .line 74 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void saveTaskOnly ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "value" # I */
/* .prologue */
/* .line 307 */
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v3 = "Nuromedia_TinyBee_Scores"; // const-string v3, "Nuromedia_TinyBee_Scores"
int v4 = 0; // const/4 v4, 0x0
(( android.content.Context ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 308 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 311 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v2 = "STATS6"; // const-string v2, "STATS6"
/* .line 312 */
/* .line 315 */
/* .line 317 */
(( de.nurogames.android.ticb.base.core.DataManager ) p0 ).loadOverall ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/core/DataManager;->loadOverall()V
/* .line 318 */
return;
} // .end method
public void setUserRated ( ) {
/* .locals 5 */
/* .prologue */
/* .line 335 */
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v3 = "Nuromedia_TinyBee_Settings"; // const-string v3, "Nuromedia_TinyBee_Settings"
int v4 = 0; // const/4 v4, 0x0
(( android.content.Context ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 336 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 339 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v2 = "RATED"; // const-string v2, "RATED"
int v3 = 1; // const/4 v3, 0x1
/* .line 342 */
/* .line 343 */
return;
} // .end method
