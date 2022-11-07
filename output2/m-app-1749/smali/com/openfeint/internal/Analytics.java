public class com.openfeint.internal.Analytics {
	 /* .source "Analytics.java" */
	 /* # instance fields */
	 Long dashboardMilliseconds;
	 java.util.Date dashboardStart;
	 Long gameSessionMilliseconds;
	 Integer numDashboardLaunches;
	 Integer numGameSessions;
	 Integer numOnlineGameSessions;
	 java.util.Date sessionStart;
	 /* # direct methods */
	 public com.openfeint.internal.Analytics ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 25 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
		 final String v2 = "FeintAnalytics"; // const-string v2, "FeintAnalytics"
		 int v3 = 0; // const/4 v3, 0x0
		 (( android.content.Context ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 26 */
		 /* .local v0, "prefs":Landroid/content/SharedPreferences; */
		 final String v1 = "dashboardLaunches"; // const-string v1, "dashboardLaunches"
		 /* iget v2, p0, Lcom/openfeint/internal/Analytics;->numDashboardLaunches:I */
		 /* .line 27 */
		 final String v1 = "sessionLaunches"; // const-string v1, "sessionLaunches"
		 /* iget v2, p0, Lcom/openfeint/internal/Analytics;->numGameSessions:I */
		 /* .line 28 */
		 final String v1 = "onlineSessions"; // const-string v1, "onlineSessions"
		 /* iget v2, p0, Lcom/openfeint/internal/Analytics;->numOnlineGameSessions:I */
		 /* .line 29 */
		 final String v1 = "sessionMilliseconds"; // const-string v1, "sessionMilliseconds"
		 /* iget-wide v2, p0, Lcom/openfeint/internal/Analytics;->gameSessionMilliseconds:J */
		 /* .line 30 */
		 final String v1 = "dashboardMilliseconds"; // const-string v1, "dashboardMilliseconds"
		 /* iget-wide v2, p0, Lcom/openfeint/internal/Analytics;->dashboardMilliseconds:J */
		 /* .line 31 */
		 return;
	 } // .end method
	 private void update ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 69 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
		 final String v2 = "FeintAnalytics"; // const-string v2, "FeintAnalytics"
		 int v3 = 0; // const/4 v3, 0x0
		 (( android.content.Context ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 70 */
		 /* .local v0, "prefs":Landroid/content/SharedPreferences$Editor; */
		 final String v1 = "dashboardLaunches"; // const-string v1, "dashboardLaunches"
		 /* iget v2, p0, Lcom/openfeint/internal/Analytics;->numDashboardLaunches:I */
		 /* .line 71 */
		 final String v1 = "sessionLaunches"; // const-string v1, "sessionLaunches"
		 /* iget v2, p0, Lcom/openfeint/internal/Analytics;->numGameSessions:I */
		 /* .line 72 */
		 final String v1 = "onlineSessions"; // const-string v1, "onlineSessions"
		 /* iget v2, p0, Lcom/openfeint/internal/Analytics;->numOnlineGameSessions:I */
		 /* .line 73 */
		 final String v1 = "sessionMilliseconds"; // const-string v1, "sessionMilliseconds"
		 /* iget-wide v2, p0, Lcom/openfeint/internal/Analytics;->gameSessionMilliseconds:J */
		 /* .line 74 */
		 final String v1 = "dashboardMilliseconds"; // const-string v1, "dashboardMilliseconds"
		 /* iget-wide v2, p0, Lcom/openfeint/internal/Analytics;->dashboardMilliseconds:J */
		 /* .line 75 */
		 /* .line 76 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void markDashboardClose ( ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* .line 40 */
		 v0 = this.dashboardStart;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 41 */
			 /* iget-wide v0, p0, Lcom/openfeint/internal/Analytics;->dashboardMilliseconds:J */
			 /* new-instance v2, Ljava/util/Date; */
			 /* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
			 (( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
			 /* move-result-wide v2 */
			 v4 = this.dashboardStart;
			 (( java.util.Date ) v4 ).getTime ( ); // invoke-virtual {v4}, Ljava/util/Date;->getTime()J
			 /* move-result-wide v4 */
			 /* sub-long/2addr v2, v4 */
			 /* add-long/2addr v0, v2 */
			 /* iput-wide v0, p0, Lcom/openfeint/internal/Analytics;->dashboardMilliseconds:J */
			 /* .line 42 */
			 int v0 = 0; // const/4 v0, 0x0
			 this.dashboardStart = v0;
			 /* .line 43 */
			 /* invoke-direct {p0}, Lcom/openfeint/internal/Analytics;->update()V */
			 /* .line 48 */
		 } // :goto_0
		 return;
		 /* .line 46 */
	 } // :cond_0
	 final String v0 = "Analytics"; // const-string v0, "Analytics"
	 final String v1 = "Dashboard closed without known starting time"; // const-string v1, "Dashboard closed without known starting time"
	 com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
} // .end method
public void markDashboardOpen ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 34 */
	 /* iget v0, p0, Lcom/openfeint/internal/Analytics;->numDashboardLaunches:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/openfeint/internal/Analytics;->numDashboardLaunches:I */
	 /* .line 35 */
	 /* new-instance v0, Ljava/util/Date; */
	 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
	 this.dashboardStart = v0;
	 /* .line 36 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/Analytics;->update()V */
	 /* .line 37 */
	 return;
} // .end method
public void markSessionClose ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 /* .line 58 */
	 v0 = this.sessionStart;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 59 */
		 /* iget-wide v0, p0, Lcom/openfeint/internal/Analytics;->gameSessionMilliseconds:J */
		 /* new-instance v2, Ljava/util/Date; */
		 /* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
		 (( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v2 */
		 v4 = this.sessionStart;
		 (( java.util.Date ) v4 ).getTime ( ); // invoke-virtual {v4}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v4 */
		 /* sub-long/2addr v2, v4 */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/openfeint/internal/Analytics;->gameSessionMilliseconds:J */
		 /* .line 60 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.sessionStart = v0;
		 /* .line 61 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/Analytics;->update()V */
		 /* .line 66 */
	 } // :goto_0
	 return;
	 /* .line 64 */
} // :cond_0
final String v0 = "Analytics"; // const-string v0, "Analytics"
final String v1 = "Session closed without known starting time"; // const-string v1, "Session closed without known starting time"
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
} // .end method
public void markSessionOpen ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "online" # Z */
/* .prologue */
/* .line 51 */
/* iget v0, p0, Lcom/openfeint/internal/Analytics;->numGameSessions:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/openfeint/internal/Analytics;->numGameSessions:I */
/* .line 52 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* iget v0, p0, Lcom/openfeint/internal/Analytics;->numOnlineGameSessions:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/openfeint/internal/Analytics;->numOnlineGameSessions:I */
	 /* .line 53 */
} // :cond_0
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
this.sessionStart = v0;
/* .line 54 */
/* invoke-direct {p0}, Lcom/openfeint/internal/Analytics;->update()V */
/* .line 55 */
return;
} // .end method
