public class org.anddev.andengine.util.levelstats.LevelStatsDBConnector {
	 /* # static fields */
	 private static final java.lang.String PREFERENCES_LEVELSTATSDBCONNECTOR_PLAYERID_ID;
	 /* # instance fields */
	 private final Integer mPlayerID;
	 private final java.lang.String mSecret;
	 private final java.lang.String mSubmitURL;
	 /* # direct methods */
	 public org.anddev.andengine.util.levelstats.LevelStatsDBConnector ( ) {
		 /* .locals 3 */
		 int v2 = -1; // const/4 v2, -0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mSecret = p2;
		 this.mSubmitURL = p3;
		 org.anddev.andengine.util.SimplePreferences .getInstance ( p1 );
		 v0 = 		 final String v1 = "preferences.levelstatsdbconnector.playerid"; // const-string v1, "preferences.levelstatsdbconnector.playerid"
		 /* if-eq v0, v2, :cond_0 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector;->mPlayerID:I */
	 } // :goto_0
	 return;
} // :cond_0
/* const v0, 0x3b9aca00 */
/* const v1, 0x7fffffff */
v0 = org.anddev.andengine.util.MathUtils .random ( v0,v1 );
/* iput v0, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector;->mPlayerID:I */
org.anddev.andengine.util.SimplePreferences .getEditorInstance ( p1 );
final String v1 = "preferences.levelstatsdbconnector.playerid"; // const-string v1, "preferences.levelstatsdbconnector.playerid"
/* iget v2, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector;->mPlayerID:I */
} // .end method
static java.lang.String access$0 ( org.anddev.andengine.util.levelstats.LevelStatsDBConnector p0 ) { //synthethic
/* .locals 1 */
v0 = this.mSubmitURL;
} // .end method
static Integer access$1 ( org.anddev.andengine.util.levelstats.LevelStatsDBConnector p0 ) { //synthethic
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector;->mPlayerID:I */
} // .end method
static java.lang.String access$2 ( org.anddev.andengine.util.levelstats.LevelStatsDBConnector p0 ) { //synthethic
/* .locals 1 */
v0 = this.mSecret;
} // .end method
/* # virtual methods */
public void submitAsync ( Integer p0, Boolean p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.util.levelstats.LevelStatsDBConnector ) p0 ).submitAsync ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector;->submitAsync(IZILorg/anddev/andengine/util/Callback;)V
return;
} // .end method
public void submitAsync ( Integer p0, Boolean p1, Integer p2, org.anddev.andengine.util.Callback p3 ) {
/* .locals 7 */
/* new-instance v6, Ljava/lang/Thread; */
/* new-instance v0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;-><init>(Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector;IZILorg/anddev/andengine/util/Callback;)V */
/* invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v6 ).start ( ); // invoke-virtual {v6}, Ljava/lang/Thread;->start()V
return;
} // .end method
