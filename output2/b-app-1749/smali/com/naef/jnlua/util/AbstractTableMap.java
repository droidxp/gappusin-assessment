public abstract class com.naef.jnlua.util.AbstractTableMap extends java.util.AbstractMap implements com.naef.jnlua.LuaValueProxy {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/util/AbstractTableMap$1;, */
	 /* Lcom/naef/jnlua/util/AbstractTableMap$Entry;, */
	 /* Lcom/naef/jnlua/util/AbstractTableMap$EntryIterator;, */
	 /* Lcom/naef/jnlua/util/AbstractTableMap$EntrySet; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/util/AbstractMap", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;", */
/* "Lcom/naef/jnlua/LuaValueProxy;" */
/* } */
} // .end annotation
/* # instance fields */
private java.util.Set entrySet;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.naef.jnlua.util.AbstractTableMap ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V */
return;
} // .end method
/* # virtual methods */
protected Boolean acceptKey ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void checkKey ( java.lang.Object p0 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "key must not be null"; // const-string v1, "key must not be null"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
return;
} // .end method
public Boolean containsKey ( java.lang.Object p0 ) {
/* .locals 3 */
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).checkKey ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->checkKey(Ljava/lang/Object;)V
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p1 ); // invoke-virtual {v1, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
int v0 = -2; // const/4 v0, -0x2
(( com.naef.jnlua.LuaState ) v1 ).getTable ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->getTable(I)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
int v0 = -1; // const/4 v0, -0x1
try { // :try_start_1
(( com.naef.jnlua.LuaState ) v1 ).isNil ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->isNil(I)Z
/* :try_end_1 */
v0 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
int v2 = 2; // const/4 v2, 0x2
try { // :try_start_2
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
int v2 = 2; // const/4 v2, 0x2
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* throw v0 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* throw v0 */
} // .end method
protected abstract java.lang.Object convertKey ( Integer p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TK;" */
/* } */
} // .end annotation
} // .end method
public java.util.Set entrySet ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
v0 = this.entrySet;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/naef/jnlua/util/AbstractTableMap$EntrySet; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/util/AbstractTableMap$EntrySet;-><init>(Lcom/naef/jnlua/util/AbstractTableMap;Lcom/naef/jnlua/util/AbstractTableMap$1;)V */
this.entrySet = v0;
} // :cond_0
v0 = this.entrySet;
} // .end method
protected Boolean filterKeys ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object get ( java.lang.Object p0 ) {
/* .locals 3 */
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).checkKey ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->checkKey(Ljava/lang/Object;)V
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p1 ); // invoke-virtual {v1, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
int v0 = -2; // const/4 v0, -0x2
(( com.naef.jnlua.LuaState ) v1 ).getTable ( v0 ); // invoke-virtual {v1, v0}, Lcom/naef/jnlua/LuaState;->getTable(I)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
int v0 = -1; // const/4 v0, -0x1
try { // :try_start_1
/* const-class v2, Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) v1 ).toJavaObject ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/naef/jnlua/LuaState;->toJavaObject(ILjava/lang/Class;)Ljava/lang/Object;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
int v2 = 2; // const/4 v2, 0x2
try { // :try_start_2
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
int v2 = 2; // const/4 v2, 0x2
(( com.naef.jnlua.LuaState ) v1 ).pop ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* throw v0 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* throw v0 */
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
v0 = (( com.naef.jnlua.util.AbstractTableMap ) p0 ).entrySet ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->entrySet()Ljava/util/Set;
} // .end method
public java.lang.Object put ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).checkKey ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->checkKey(Ljava/lang/Object;)V
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p1 ); // invoke-virtual {v1, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p2 ); // invoke-virtual {v1, p2}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
int v2 = -3; // const/4 v2, -0x3
(( com.naef.jnlua.LuaState ) v1 ).setTable ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->setTable(I)V
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
public java.lang.Object remove ( java.lang.Object p0 ) {
/* .locals 3 */
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).checkKey ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->checkKey(Ljava/lang/Object;)V
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).getLuaState ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
/* monitor-enter v1 */
try { // :try_start_0
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( com.naef.jnlua.util.AbstractTableMap ) p0 ).pushValue ( ); // invoke-virtual {p0}, Lcom/naef/jnlua/util/AbstractTableMap;->pushValue()V
(( com.naef.jnlua.LuaState ) v1 ).pushJavaObject ( p1 ); // invoke-virtual {v1, p1}, Lcom/naef/jnlua/LuaState;->pushJavaObject(Ljava/lang/Object;)V
(( com.naef.jnlua.LuaState ) v1 ).pushNil ( ); // invoke-virtual {v1}, Lcom/naef/jnlua/LuaState;->pushNil()V
int v2 = -3; // const/4 v2, -0x3
(( com.naef.jnlua.LuaState ) v1 ).setTable ( v2 ); // invoke-virtual {v1, v2}, Lcom/naef/jnlua/LuaState;->setTable(I)V
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
