
export default function CreateClass() {

    return (
        <div className="newUser">
            <h1 className="newUserTitle">New Class</h1>
            <form className="newUserForm">
                <div className="newUserItem">
                    <label>Libelle</label>
                    <input type="text" placeholder="john" />
                </div>
                <div className="newUserItem">
                    <label>Niveau</label>
                    <input type="text" placeholder="john" />
                </div>
                <button className="newUserButton">Create</button>
            </form>
        </div>
    );

}
