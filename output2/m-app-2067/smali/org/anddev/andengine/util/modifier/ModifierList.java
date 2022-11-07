public class org.anddev.andengine.util.modifier.ModifierList extends org.anddev.andengine.util.SmartList implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private final java.lang.Object mTarget;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.ModifierList ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/SmartList;-><init>()V */
		 this.mTarget = p1;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.ModifierList ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p2}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 this.mTarget = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object getTarget ( ) {
		 /* .locals 1 */
		 v0 = this.mTarget;
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 3 */
		 v0 = 		 (( org.anddev.andengine.util.modifier.ModifierList ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/ModifierList;->size()I
		 /* if-lez v0, :cond_0 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
		 /* move v1, v0 */
	 } // :goto_0
	 /* if-gez v1, :cond_1 */
} // :cond_0
return;
} // :cond_1
(( java.util.ArrayList ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/util/modifier/IModifier; */
v2 = v2 = this.mTarget;
v0 = if ( v2 != null) { // if-eqz v2, :cond_2
if ( v0 != null) { // if-eqz v0, :cond_2
	 (( java.util.ArrayList ) p0 ).remove ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
} // :cond_2
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
} // .end method
public void reset ( ) {
/* .locals 2 */
v0 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* move v1, v0 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/util/modifier/IModifier; */
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
} // .end method
