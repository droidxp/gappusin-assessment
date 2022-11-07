class com.naef.jnlua.util.AbstractTableMap$EntrySet extends java.util.AbstractSet {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/util/AbstractTableMap; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "EntrySet" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/AbstractSet", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
/* # instance fields */
final com.naef.jnlua.util.AbstractTableMap this$0; //synthetic
/* # direct methods */
private com.naef.jnlua.util.AbstractTableMap$EntrySet ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V */
return;
} // .end method
 com.naef.jnlua.util.AbstractTableMap$EntrySet ( ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap$EntrySet;-><init>(Lcom/naef/jnlua/util/AbstractTableMap;)V */
return;
} // .end method
/* # virtual methods */
public Boolean contains ( java.lang.Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
v1 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v1 ).checkKey ( p1 ); // invoke-virtual {v1, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->checkKey(Ljava/lang/Object;)V
/* instance-of v1, p1, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* check-cast p1, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
com.naef.jnlua.util.AbstractTableMap$Entry .access$200 ( p1 );
v2 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v2 ).getLuaState ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* if-ne v1, v2, :cond_0 */
v0 = this.this$0;
com.naef.jnlua.util.AbstractTableMap$Entry .access$300 ( p1 );
v0 = (( com.naef.jnlua.util.AbstractTableMap ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, Lcom/naef/jnlua/util/AbstractTableMap;->containsKey(Ljava/lang/Object;)Z
} // .end method
public Boolean isEmpty ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
v1 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v1 ).getLuaState ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
v2 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v2 ).pushValue ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
(( com.naef.jnlua.LuaState ) v1 ).pushNil ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/LuaState;->pushNil()V
} // :cond_0
int v2 = -2; // const/4 v2, -0x2
v2 = (( com.naef.jnlua.LuaState ) v1 ).next ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->next(I)Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.this$0;
v2 = (( com.naef.jnlua.util.AbstractTableMap ) v2 ).filterKeys ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->filterKeys()Z
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.this$0;
int v3 = -2; // const/4 v3, -0x2
v2 = (( com.naef.jnlua.util.AbstractTableMap ) v2 ).acceptKey ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/util/AbstractTableMap;->acceptKey(I)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_1
int v0 = 3; // const/4 v0, 0x3
(( com.naef.jnlua.LuaState ) v1 ).pop ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->pop(I)V
int v0 = 0; // const/4 v0, 0x0
/* monitor-exit v1 */
} // :goto_0
} // :cond_2
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public java.util.Iterator iterator ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
/* new-instance v0, Lcom/naef/jnlua/util/AbstractTableMap$EntryIterator; */
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Lcom/naef/jnlua/util/AbstractTableMap$EntryIterator;-><init>(Lcom/naef/jnlua/util/AbstractTableMap;Lcom/naef/jnlua/util/AbstractTableMap$1;)V */
} // .end method
public Boolean remove ( java.lang.Object p0 ) {
/* .locals 4 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* instance-of v0, p1, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* move-object v0, p1 */
/* check-cast v0, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
com.naef.jnlua.util.AbstractTableMap$Entry .access$200 ( v0 );
v3 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v3 ).getLuaState ( ); // invoke-virtual {v3}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* if-eq v0, v3, :cond_1 */
/* move v0, v1 */
} // :cond_1
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v3 */
try { // :try_start_0
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).pushValue ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
(( com.naef.jnlua.LuaState ) v3 ).pushJavaObject ( p1 ); // invoke-virtual {v3, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
int v0 = -2; // const/4 v0, -0x2
(( com.naef.jnlua.LuaState ) v3 ).getTable ( v0 ); // invoke-virtual {v3, v0}, Lcom/naef/jnlua/LuaState;->getTable(I)V
int v0 = -1; // const/4 v0, -0x1
v0 = (( com.naef.jnlua.LuaState ) v3 ).isNil ( v0 ); // invoke-virtual {v3, v0}, Lcom/naef/jnlua/LuaState;->isNil(I)Z
/* if-nez v0, :cond_3 */
/* move v0, v2 */
} // :goto_1
int v1 = 1; // const/4 v1, 0x1
(( com.naef.jnlua.LuaState ) v3 ).pop ( v1 ); // invoke-virtual {v3, v1}, Lcom/naef/jnlua/LuaState;->pop(I)V
if ( v0 != null) { // if-eqz v0, :cond_2
(( com.naef.jnlua.LuaState ) v3 ).pushJavaObject ( p1 ); // invoke-virtual {v3, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) v3 ).pushNil ( ); // invoke-virtual {v3}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v1 = -3; // const/4 v1, -0x3
(( com.naef.jnlua.LuaState ) v3 ).setTable ( v1 ); // invoke-virtual {v3, v1}, Lcom/naef/jnlua/LuaState;->setTable(I)V
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
(( com.naef.jnlua.LuaState ) v3 ).pop ( v1 ); // invoke-virtual {v3, v1}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v3 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_3
/* move v0, v1 */
} // .end method
public Integer size ( ) {
/* .locals 4 */
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
v2 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v2 ).pushValue ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
v2 = this.this$0;
v2 = (( com.naef.jnlua.util.AbstractTableMap ) v2 ).filterKeys ( ); // invoke-virtual {v2}, Lcom/naef/jnlua/util/AbstractTableMap;->filterKeys()Z
if ( v2 != null) { // if-eqz v2, :cond_1
(( com.naef.jnlua.LuaState ) v1 ).pushNil ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/LuaState;->pushNil()V
} // :goto_0
int v2 = -2; // const/4 v2, -0x2
v2 = (( com.naef.jnlua.LuaState ) v1 ).next ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->next(I)Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.this$0;
int v3 = -2; // const/4 v3, -0x2
v2 = (( com.naef.jnlua.util.AbstractTableMap ) v2 ).acceptKey ( v3 ); // invoke-virtual {v2, v3}, Lcom/naef/jnlua/util/AbstractTableMap;->acceptKey(I)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
try { // :try_start_1
v0 = (( com.naef.jnlua.LuaState ) v1 ).tableSize ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->tableSize(I)I
} // :cond_2
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // .end method
