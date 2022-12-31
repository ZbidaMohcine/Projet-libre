import React from 'react'
import { useLocation, Navigate, Outlet } from 'react-router-dom'

const RequireAuth = ({ allowedRoles }) => {
  const user = true
  const location = useLocation();
  return (
    user?.roles?.find(role => allowedRoles?.includes(role))
      ? <Outlet />
      : user
        ? <Navigate to="/Error404" state={{ from: location }} replace />
        : <Navigate to="/login" state={{ from: location }} replace />
  )
}

export default RequireAuth
