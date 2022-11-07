public class de.nurogames.android.ticb.base.core.FlurryAnalyticsManager {
	 /* .source "FlurryAnalyticsManager.java" */
	 /* # static fields */
	 public static java.lang.String EVENT_01_SCORE_REACHED_AT_GAMEOVER;
	 public static java.lang.String EVENT_02_SCORE_REACHED_AT_COMPLETE;
	 public static java.lang.String EVENT_03_CLICKED_CROSSGAME;
	 public static java.lang.String EVENT_04_UPGRADED_TO_PRO;
	 public static java.lang.String EVENT_05_AD_CLICKED;
	 public static java.lang.String EVENT_06_PURCHASED_CHARACTER;
	 public static java.lang.String EVENT_07_PLAY_DEFAULT_MODE;
	 public static java.lang.String EVENT_08_PLAY_ENDLESS_MODE;
	 public static java.lang.String EVENT_09_PLAY_DIFFICULTY_KIDS;
	 public static java.lang.String EVENT_10_PLAY_DIFFICULTY_NORMAL;
	 public static java.lang.String EVENT_11_PLAY_DIFFICULTY_HARD;
	 public static java.lang.String EVENT_12_FINISHED_ALL_LEVELS;
	 public static java.lang.String EVENT_13_FINISHED_TASKS;
	 public static java.lang.String EVENT_14_FINISHED_SUBTASK;
	 public static java.lang.String EVENT_15_REACHED_LEVEL;
	 public static java.lang.String EVENT_16_POSTED_ON_FACEBOOK;
	 public static java.lang.String EVENT_17_CLICKED_MORE_GAMES;
	 public static java.lang.String EVENT_18_ACHIEVMENT_COMPLETE;
	 public static java.lang.String EVENT_19_CLICKED_OPENFEINT;
	 public static java.lang.String EVENT_20_PURCHASED_INAPP_ITEM_NAME;
	 public static java.lang.String EVENT_21_PURCHASED_INAPP_ITEM_PRICE;
	 public static java.lang.String EVENT_22_DEVICE_INFO;
	 public static java.lang.String FLURRY_APP_ID;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.core.FlurryAnalyticsManager ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 11 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.FLURRY_APP_ID;
		 /* .line 14 */
		 final String v0 = "highscore_reached_gameover"; // const-string v0, "highscore_reached_gameover"
		 /* .line 15 */
		 final String v0 = "highscore_reached_complete"; // const-string v0, "highscore_reached_complete"
		 /* .line 16 */
		 final String v0 = "clicked_crossgame"; // const-string v0, "clicked_crossgame"
		 /* .line 17 */
		 final String v0 = "upgraded_to_pro"; // const-string v0, "upgraded_to_pro"
		 /* .line 18 */
		 final String v0 = "clicked_ad"; // const-string v0, "clicked_ad"
		 /* .line 19 */
		 final String v0 = "purchased_inapp_character"; // const-string v0, "purchased_inapp_character"
		 /* .line 20 */
		 final String v0 = "plays_defaultmode"; // const-string v0, "plays_defaultmode"
		 /* .line 21 */
		 final String v0 = "plays_endlessmode"; // const-string v0, "plays_endlessmode"
		 /* .line 22 */
		 final String v0 = "plays_difficulty_kids"; // const-string v0, "plays_difficulty_kids"
		 /* .line 23 */
		 final String v0 = "plays_difficulty_normal"; // const-string v0, "plays_difficulty_normal"
		 /* .line 24 */
		 final String v0 = "plays_difficulty_hard"; // const-string v0, "plays_difficulty_hard"
		 /* .line 25 */
		 final String v0 = "finished_all_levels"; // const-string v0, "finished_all_levels"
		 /* .line 26 */
		 final String v0 = "finished_task_nr"; // const-string v0, "finished_task_nr"
		 /* .line 27 */
		 final String v0 = "finished_subtask_nr"; // const-string v0, "finished_subtask_nr"
		 /* .line 28 */
		 final String v0 = "reached_level_nr"; // const-string v0, "reached_level_nr"
		 /* .line 29 */
		 final String v0 = "posted_on_facebook_wall"; // const-string v0, "posted_on_facebook_wall"
		 /* .line 30 */
		 final String v0 = "clicked_moregames"; // const-string v0, "clicked_moregames"
		 /* .line 31 */
		 final String v0 = "achievement_completed"; // const-string v0, "achievement_completed"
		 /* .line 32 */
		 final String v0 = "clicked_openfeint"; // const-string v0, "clicked_openfeint"
		 /* .line 34 */
		 final String v0 = "purchased_inapp_item_name"; // const-string v0, "purchased_inapp_item_name"
		 /* .line 35 */
		 final String v0 = "purchased_inapp_item_price"; // const-string v0, "purchased_inapp_item_price"
		 /* .line 37 */
		 final String v0 = "device_info"; // const-string v0, "device_info"
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.core.FlurryAnalyticsManager ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void logEvent ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p0, "eventId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 42 */
		 /* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_flurry:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 43 */
			 /* new-instance v0, Ljava/lang/Thread; */
			 /* new-instance v1, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$1; */
			 /* invoke-direct {v1, p0}, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$1;-><init>(Ljava/lang/String;)V */
			 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
			 /* .line 47 */
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
			 /* .line 49 */
		 } // :cond_0
		 return;
	 } // .end method
	 public static void logEvent ( java.lang.String p0, java.util.Map p1 ) {
		 /* .locals 2 */
		 /* .param p0, "eventId" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/util/Map", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 64 */
	 /* .local p1, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
	 /* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_flurry:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 65 */
		 /* new-instance v0, Ljava/lang/Thread; */
		 /* new-instance v1, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$3; */
		 /* invoke-direct {v1, p0, p1}, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$3;-><init>(Ljava/lang/String;Ljava/util/Map;)V */
		 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
		 /* .line 69 */
		 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
		 /* .line 71 */
	 } // :cond_0
	 return;
} // .end method
public static void logEvent ( java.lang.String p0, java.util.Map p1, Boolean p2 ) {
	 /* .locals 2 */
	 /* .param p0, "eventId" # Ljava/lang/String; */
	 /* .param p2, "timed" # Z */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;Z)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 75 */
/* .local p1, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_flurry:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 76 */
	 /* new-instance v0, Ljava/lang/Thread; */
	 /* new-instance v1, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$4; */
	 /* invoke-direct {v1, p0, p1, p2}, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$4;-><init>(Ljava/lang/String;Ljava/util/Map;Z)V */
	 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
	 /* .line 80 */
	 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
	 /* .line 82 */
} // :cond_0
return;
} // .end method
public static void logEvent ( java.lang.String p0, Boolean p1 ) {
/* .locals 2 */
/* .param p0, "eventId" # Ljava/lang/String; */
/* .param p1, "timed" # Z */
/* .prologue */
/* .line 53 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_flurry:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 54 */
	 /* new-instance v0, Ljava/lang/Thread; */
	 /* new-instance v1, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$2; */
	 /* invoke-direct {v1, p0, p1}, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$2;-><init>(Ljava/lang/String;Z)V */
	 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
	 /* .line 58 */
	 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
	 /* .line 60 */
} // :cond_0
return;
} // .end method
