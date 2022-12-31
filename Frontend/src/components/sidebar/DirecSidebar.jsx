import "./DirecSidebar.css";
import {
    LineStyle,
    DynamicFeed,
    ChatBubbleOutline,
    WorkOutline,
    Report,

} from "@material-ui/icons";
import { Link } from "react-router-dom";
import DateRangeIcon from '@mui/icons-material/DateRange';
import ArticleIcon from '@mui/icons-material/Article';
import BackpackIcon from '@mui/icons-material/Backpack';
import FestivalIcon from '@mui/icons-material/Festival';
import PlaylistAddCheckCircleIcon from '@mui/icons-material/PlaylistAddCheckCircle';
import AssignmentTurnedInIcon from '@mui/icons-material/AssignmentTurnedIn';
import ContactsIcon from '@mui/icons-material/Contacts';
import InsertDriveFileIcon from '@mui/icons-material/InsertDriveFile';
import SchoolIcon from '@mui/icons-material/School';
import CoPresentIcon from '@mui/icons-material/CoPresent';
import GroupsIcon from '@mui/icons-material/Groups';
import SafetyDividerIcon from '@mui/icons-material/SafetyDivider';
import InsightsIcon from '@mui/icons-material/Insights';

export default function DirecSidebar() {
    return (
        <div className="sidebar">
            <div className="sidebarWrapper">
                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Dashboard</h3>
                    <ul className="sidebarList">
                        <Link to="/" className="link">
                            <li className="sidebarListItem active">
                                <LineStyle className="sidebarIcon" />
                                Home
                            </li>
                        </Link>
                        <Link to="/student" className="link">
                            <li className="sidebarListItem active">
                                <SchoolIcon className="sidebarIcon" />
                                Espace Etudant
                            </li>
                        </Link>
                        <Link to="/enseignant" className="link">
                            <li className="sidebarListItem active">
                                <CoPresentIcon className="sidebarIcon" />
                                Espace Enseignant
                            </li>
                        </Link>
                    </ul>
                </div>
                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Menu</h3>
                    <ul className="sidebarList">
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <AssignmentTurnedInIcon className="sidebarIcon" />
                                Circulaire
                            </li>
                        </Link>
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <FestivalIcon className="sidebarIcon" />
                                Evenements
                            </li>
                        </Link>
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <GroupsIcon className="sidebarIcon" />
                                Reunion
                            </li>
                        </Link>
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <ArticleIcon className="sidebarIcon" />
                                Documents
                            </li>
                        </Link>
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <DynamicFeed className="sidebarIcon" />
                                Forums
                            </li>
                        </Link>
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <SafetyDividerIcon className="sidebarIcon" />
                                Sondages
                            </li>
                        </Link>



                    </ul>
                </div>
                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Messagerie</h3>
                    <ul className="sidebarList">
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <ChatBubbleOutline className="sidebarIcon" />
                                Messages
                            </li>
                        </Link>
                    </ul>
                </div>
                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Analyse</h3>
                    <ul className="sidebarList">
                        <Link to="/" className="link">
                            <li className="sidebarListItem">
                                <InsightsIcon className="sidebarIcon" />
                                Statistiques
                            </li>
                        </Link>
                    </ul>
                </div>
            </div>
        </div>
    );
}
