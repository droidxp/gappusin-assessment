public class com.wiyun.engine.nodes.Button extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IColorable {
	 /* .source "Button.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Button ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 205 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 206 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Button ( ) {
		 /* .locals 7 */
		 /* .param p1, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p2, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p3, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p4, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p5, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 176 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 177 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move-object v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Button;->nativeInit(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
		 /* .line 178 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Button ( ) {
		 /* .locals 0 */
		 /* .param p1, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p2, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p3, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p4, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p5, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p6, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 190 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 191 */
		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/nodes/Button;->nativeInit(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
		 /* .line 192 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Button from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 201 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Button;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.Button .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.Button make ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 7 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "focusedResId" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 102 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 103 */
/* if-nez p1, :cond_0 */
/* move-object v2, v5 */
/* .line 104 */
} // :goto_0
/* if-nez p2, :cond_1 */
/* move-object v3, v5 */
/* .line 105 */
} // :goto_1
/* if-nez p3, :cond_2 */
/* move-object v4, v5 */
} // :goto_2
/* move-object v6, v5 */
/* .line 102 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 103 */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 104 */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 105 */
} // :cond_2
com.wiyun.engine.nodes.Sprite .make ( p3 );
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v4, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.Button make ( Integer p0, Integer p1, Integer p2, Integer p3, com.wiyun.engine.nodes.Node p4, java.lang.String p5 ) {
/* .locals 7 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "focusedResId" # I */
/* .param p4, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p5, "selector" # Ljava/lang/String; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 122 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 123 */
/* if-nez p1, :cond_0 */
/* move-object v2, v6 */
/* .line 124 */
} // :goto_0
/* if-nez p2, :cond_1 */
/* move-object v3, v6 */
/* .line 125 */
} // :goto_1
/* if-nez p3, :cond_2 */
/* move-object v4, v6 */
/* .line 126 */
} // :goto_2
/* new-instance v5, Lcom/wiyun/engine/utils/TargetSelector; */
/* invoke-direct {v5, p4, p5, v6}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* .line 122 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 123 */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 124 */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 125 */
} // :cond_2
com.wiyun.engine.nodes.Sprite .make ( p3 );
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v4, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.Button make ( Integer p0, Integer p1, Integer p2, Integer p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 6 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "focusedResId" # I */
/* .param p4, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 140 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 141 */
/* if-nez p1, :cond_0 */
/* move-object v2, v4 */
/* .line 142 */
} // :goto_0
/* if-nez p2, :cond_1 */
/* move-object v3, v4 */
/* .line 143 */
} // :goto_1
/* if-nez p3, :cond_2 */
} // :goto_2
/* move-object v5, p4 */
/* .line 140 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 141 */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
(( com.wiyun.engine.nodes.Sprite ) v2 ).autoRelease ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v2, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 142 */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 143 */
} // :cond_2
com.wiyun.engine.nodes.Sprite .make ( p3 );
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v4, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.Button make ( Integer p0, Integer p1, Integer p2, Integer p3, com.wiyun.engine.utils.TargetSelector p4, com.wiyun.engine.utils.TargetSelector p5 ) {
/* .locals 7 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "disabledResId" # I */
/* .param p3, "focusedResId" # I */
/* .param p4, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p5, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 159 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
com.wiyun.engine.nodes.Sprite .make ( p0 );
(( com.wiyun.engine.nodes.Sprite ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v1, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 160 */
/* if-nez p1, :cond_0 */
/* move-object v2, v4 */
/* .line 161 */
} // :goto_0
/* if-nez p2, :cond_1 */
/* move-object v3, v4 */
/* .line 162 */
} // :goto_1
/* if-nez p3, :cond_2 */
} // :goto_2
/* move-object v5, p4 */
/* move-object v6, p5 */
/* .line 159 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 160 */
} // :cond_0
com.wiyun.engine.nodes.Sprite .make ( p1 );
/* .line 161 */
} // :cond_1
com.wiyun.engine.nodes.Sprite .make ( p2 );
(( com.wiyun.engine.nodes.Sprite ) v3 ).autoRelease ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v3, Lcom/wiyun/engine/nodes/Sprite; */
/* .line 162 */
} // :cond_2
com.wiyun.engine.nodes.Sprite .make ( p3 );
(( com.wiyun.engine.nodes.Sprite ) v4 ).autoRelease ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Sprite;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v4, Lcom/wiyun/engine/nodes/Sprite; */
} // .end method
public static com.wiyun.engine.nodes.Button make ( Integer p0, Integer p1, com.wiyun.engine.nodes.Node p2, java.lang.String p3 ) {
/* .locals 6 */
/* .param p0, "normalResId" # I */
/* .param p1, "selectedResId" # I */
/* .param p2, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "selector" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 89 */
/* move v0, p0 */
/* move v1, p1 */
/* move v3, v2 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Button;->make(IIIILcom/wiyun/engine/nodes/Node;Ljava/lang/String;)Lcom/wiyun/engine/nodes/Button; */
} // .end method
public static com.wiyun.engine.nodes.Button make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3 ) {
/* .locals 6 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 32 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
int v5 = 0; // const/4 v5, 0x0
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.Button make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4, java.lang.String p5 ) {
/* .locals 6 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p5, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 47 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
/* new-instance v5, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v5, p4, p5, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.Button make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 6 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 61 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.Button make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.utils.TargetSelector p4, com.wiyun.engine.utils.TargetSelector p5 ) {
/* .locals 7 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p5, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 76 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Button; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/Button;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.utils.TargetSelector p4, com.wiyun.engine.utils.TargetSelector p5 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 210 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public native Float getClickScale ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 260 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 261 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/Button;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 262 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public native void setClickScale ( Float p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 268 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/Button;->nativeSetColor(III)V */
/* .line 269 */
return;
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.opengl.Texture2D p2, com.wiyun.engine.opengl.Texture2D p3 ) {
} // .end method
public native void setTextureRect ( com.wiyun.engine.types.WYRect p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYRect p3 ) {
} // .end method
