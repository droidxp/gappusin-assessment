public class com.balloonisland.hfxw.SessionEvents {
	 /* .source "SessionEvents.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/balloonisland/hfxw/SessionEvents$AuthListener;, */
	 /* Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
	 /* } */
} // .end annotation
/* # static fields */
private static java.util.LinkedList mAuthListeners;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Lcom/balloonisland/hfxw/SessionEvents$AuthListener;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.LinkedList mLogoutListeners;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Lcom/balloonisland/hfxw/SessionEvents$LogoutListener;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.balloonisland.hfxw.SessionEvents ( ) {
/* .locals 1 */
/* .prologue */
/* .line 23 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 24 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 21 */
return;
} // .end method
public com.balloonisland.hfxw.SessionEvents ( ) {
/* .locals 0 */
/* .prologue */
/* .line 21 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static void addAuthListener ( com.balloonisland.hfxw.SessionEvents$AuthListener p0 ) {
/* .locals 1 */
/* .param p0, "listener" # Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
/* .prologue */
/* .line 35 */
v0 = com.balloonisland.hfxw.SessionEvents.mAuthListeners;
(( java.util.LinkedList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 36 */
return;
} // .end method
public static void addLogoutListener ( com.balloonisland.hfxw.SessionEvents$LogoutListener p0 ) {
/* .locals 1 */
/* .param p0, "listener" # Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
/* .prologue */
/* .line 59 */
v0 = com.balloonisland.hfxw.SessionEvents.mLogoutListeners;
(( java.util.LinkedList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 60 */
return;
} // .end method
public static void onLoginError ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "error" # Ljava/lang/String; */
/* .prologue */
/* .line 81 */
v1 = com.balloonisland.hfxw.SessionEvents.mAuthListeners;
(( java.util.LinkedList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
/* .line 84 */
return;
/* .line 81 */
} // :cond_0
/* check-cast v0, Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
/* .line 82 */
/* .local v0, "listener":Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
} // .end method
public static void onLoginSuccess ( ) {
/* .locals 3 */
/* .prologue */
/* .line 75 */
v1 = com.balloonisland.hfxw.SessionEvents.mAuthListeners;
(( java.util.LinkedList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
/* .local v0, "listener":Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
/* .line 78 */
return;
/* .line 75 */
} // :cond_0
} // .end local v0 # "listener":Lcom/balloonisland/hfxw/SessionEvents$AuthListener;
/* check-cast v0, Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
/* .line 76 */
/* .restart local v0 # "listener":Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
} // .end method
public static void onLogoutBegin ( ) {
/* .locals 3 */
/* .prologue */
/* .line 87 */
v1 = com.balloonisland.hfxw.SessionEvents.mLogoutListeners;
(( java.util.LinkedList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
/* .local v0, "l":Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
/* .line 90 */
return;
/* .line 87 */
} // :cond_0
} // .end local v0 # "l":Lcom/balloonisland/hfxw/SessionEvents$LogoutListener;
/* check-cast v0, Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
/* .line 88 */
/* .restart local v0 # "l":Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
} // .end method
public static void onLogoutFinish ( ) {
/* .locals 3 */
/* .prologue */
/* .line 93 */
v1 = com.balloonisland.hfxw.SessionEvents.mLogoutListeners;
(( java.util.LinkedList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
/* .local v0, "l":Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
/* .line 96 */
return;
/* .line 93 */
} // :cond_0
} // .end local v0 # "l":Lcom/balloonisland/hfxw/SessionEvents$LogoutListener;
/* check-cast v0, Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
/* .line 94 */
/* .restart local v0 # "l":Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
} // .end method
public static void removeAuthListener ( com.balloonisland.hfxw.SessionEvents$AuthListener p0 ) {
/* .locals 1 */
/* .param p0, "listener" # Lcom/balloonisland/hfxw/SessionEvents$AuthListener; */
/* .prologue */
/* .line 47 */
v0 = com.balloonisland.hfxw.SessionEvents.mAuthListeners;
(( java.util.LinkedList ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
/* .line 48 */
return;
} // .end method
public static void removeLogoutListener ( com.balloonisland.hfxw.SessionEvents$LogoutListener p0 ) {
/* .locals 1 */
/* .param p0, "listener" # Lcom/balloonisland/hfxw/SessionEvents$LogoutListener; */
/* .prologue */
/* .line 71 */
v0 = com.balloonisland.hfxw.SessionEvents.mLogoutListeners;
(( java.util.LinkedList ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
/* .line 72 */
return;
} // .end method
