class inal extends java.lang.Thread {
	 /* .source "GameAd.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/funbox/game/promote/GameAd;->work()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 139 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
/* .line 1 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 144 */
/* const-wide/16 v0, 0x3e8 */
try { // :try_start_0
	 com.funbox.game.promote.GameAd$1 .sleep ( v0,v1 );
	 /* .line 147 */
	 v0 = 	 com.funbox.game.promote.GameAd .access$0 ( );
	 /* if-nez v0, :cond_0 */
	 /* .line 163 */
} // :goto_0
return;
/* .line 151 */
} // :cond_0
v0 = com.funbox.game.promote.GameAd .access$1 ( );
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_1 */
/* .line 152 */
v0 = com.funbox.game.promote.GameAd .access$1 ( );
v0 = com.funbox.game.promote.GameAd .access$2 ( v0 );
/* if-nez v0, :cond_1 */
/* .line 154 */
v0 = com.funbox.game.promote.GameAd .access$1 ( );
com.funbox.game.promote.GameAd .access$3 ( v0 );
com.funbox.game.promote.GameAd .access$4 ( v0 );
/* .line 160 */
/* :catch_0 */
/* move-exception v0 */
/* .line 159 */
} // :cond_1
com.funbox.game.promote.GameAd .access$5 ( );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end method
