public class com.wiyun.engine.nodes.MenuItemLabel extends com.wiyun.engine.nodes.MenuItem implements com.wiyun.engine.nodes.Node$IColorable {
	 /* .source "MenuItemLabel.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MenuItemLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 179 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 /* .line 180 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MenuItemLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "label" # Lcom/wiyun/engine/nodes/Node; */
		 /* .param p2, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p3, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .prologue */
		 /* .line 164 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* .line 165 */
		 /* invoke-direct {p0, p2, p3, p1}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Node;)V */
		 /* .line 166 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemLabel from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 175 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.MenuItemLabel .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p0, "label" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 131 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p1, p2, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemLabel .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.utils.TargetSelector p1 ) {
/* .locals 2 */
/* .param p0, "label" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 142 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemLabel; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1, p1}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
/* .param p0, "label" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p2, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 154 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 19 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* const/high16 v0, 0x42000000 # 32.0f */
com.wiyun.engine.nodes.Label .make ( p0,v0 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v1, v0, v2, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, com.wiyun.engine.nodes.Node p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 43 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p1, p2, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemLabel .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, com.wiyun.engine.utils.TargetSelector p1 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 54 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* .line 55 */
/* const/high16 v0, 0x42000000 # 32.0f */
com.wiyun.engine.nodes.Label .make ( p0,v0 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* .line 56 */
int v2 = 0; // const/4 v2, 0x0
/* .line 54 */
/* invoke-direct {v1, v0, v2, p1}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p2, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 69 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* .line 70 */
/* const/high16 v0, 0x42000000 # 32.0f */
com.wiyun.engine.nodes.Label .make ( p0,v0 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* .line 69 */
/* invoke-direct {v1, v0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 31 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Label .make ( p0,p2,v0,p1 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* invoke-direct {v1, v0, v2, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2, com.wiyun.engine.nodes.Node p3, java.lang.String p4 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .param p3, "target" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 86 */
/* new-instance v0, Lcom/wiyun/engine/utils/TargetSelector; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, p4, v1}, Lcom/wiyun/engine/utils/TargetSelector;-><init>(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */
com.wiyun.engine.nodes.MenuItemLabel .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2, com.wiyun.engine.utils.TargetSelector p3 ) {
/* .locals 3 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .param p3, "selector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 99 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* .line 100 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Label .make ( p0,p2,v0,p1 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* .line 101 */
int v2 = 0; // const/4 v2, 0x0
/* .line 99 */
/* invoke-direct {v1, v0, v2, p3}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public static com.wiyun.engine.nodes.MenuItemLabel make ( java.lang.String p0, java.lang.String p1, Float p2, com.wiyun.engine.utils.TargetSelector p3, com.wiyun.engine.utils.TargetSelector p4 ) {
/* .locals 2 */
/* .param p0, "value" # Ljava/lang/String; */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .param p3, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p4, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 116 */
/* new-instance v1, Lcom/wiyun/engine/nodes/MenuItemLabel; */
/* .line 117 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Label .make ( p0,p2,v0,p1 );
(( com.wiyun.engine.nodes.Label ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Label;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/nodes/Label; */
/* .line 116 */
/* invoke-direct {v1, v0, p3, p4}, Lcom/wiyun/engine/nodes/MenuItemLabel;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeGetDisabledColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.Node p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void nativeSetDisabledColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 189 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 190 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 191 */
} // .end method
public com.wiyun.engine.types.WYColor3B getDisabledColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 208 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 209 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeGetDisabledColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 210 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 197 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeSetColor(III)V */
/* .line 198 */
return;
} // .end method
public void setDisabledColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 222 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemLabel;->nativeSetDisabledColor(III)V */
/* .line 223 */
return;
} // .end method
public native void setString ( java.lang.String p0 ) {
} // .end method
