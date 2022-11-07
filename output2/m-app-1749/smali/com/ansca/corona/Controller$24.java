class com.ansca.corona.Controller$24 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->openFeintLaunchDashboard(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$dashboardName; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$24 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1402 */
this.this$0 = p1;
this.val$dashboardName = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1404 */
/* monitor-enter p0 */
/* .line 1405 */
try { // :try_start_0
	 v1 = this.val$dashboardName;
	 (( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 /* .line 1406 */
	 /* .local v0, "lowerCaseDashboardName":Ljava/lang/String; */
	 final String v1 = "leaderboards"; // const-string v1, "leaderboards"
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 1408 */
		 com.openfeint.api.ui.Dashboard .openLeaderboards ( );
		 /* .line 1434 */
	 } // :cond_0
} // :goto_0
/* monitor-exit p0 */
/* .line 1435 */
return;
/* .line 1410 */
} // :cond_1
final String v1 = "achievements"; // const-string v1, "achievements"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 1412 */
com.openfeint.api.ui.Dashboard .openAchievements ( );
/* .line 1434 */
} // .end local v0 # "lowerCaseDashboardName":Ljava/lang/String;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
/* .line 1414 */
/* .restart local v0 # "lowerCaseDashboardName":Ljava/lang/String; */
} // :cond_2
try { // :try_start_1
final String v1 = "challenges"; // const-string v1, "challenges"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 1418 */
final String v1 = "friends"; // const-string v1, "friends"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 1422 */
final String v1 = "playing"; // const-string v1, "playing"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 1426 */
final String v1 = "highscore"; // const-string v1, "highscore"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 1432 */
com.openfeint.api.ui.Dashboard .open ( );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // .end method
