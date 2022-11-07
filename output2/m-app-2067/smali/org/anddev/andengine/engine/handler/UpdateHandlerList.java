public class org.anddev.andengine.engine.handler.UpdateHandlerList extends org.anddev.andengine.util.SmartList implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # direct methods */
	 public org.anddev.andengine.engine.handler.UpdateHandlerList ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/SmartList;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.handler.UpdateHandlerList ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onUpdate ( Float p0 ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.engine.handler.UpdateHandlerList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->size()I
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
		 /* move v1, v0 */
	 } // :goto_0
	 /* if-gez v1, :cond_0 */
	 return;
} // :cond_0
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/engine/handler/IUpdateHandler; */
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
} // .end method
public void reset ( ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.engine.handler.UpdateHandlerList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* move v1, v0 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/engine/handler/IUpdateHandler; */
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
} // .end method
